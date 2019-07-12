package com.jacobsohn.ohlala.model

import spock.lang.Specification

class ArticleSpec extends Specification {
    def "Two Articles are equal to each other"() {
        given:
            Article a = new Article()
            Article b = new Article()
        when:
            a.setId(1)
            b.setId(1)
        then:
            a.equals(b)
            b.equals(a)
    }

    def "Two Articles are not equal to each other"() {
        given:
            Article a = new Article()
            Article b = new Article()
        when:
            a.setId(1)
            b.setId(2)
        then:
            !a.equals(b)
            !b.equals(a)
    }

    def "Article runs smooth with null or different class as equal object"() {
        given:
            Article a = new Article()
        when:
            a.setId(1)
        then:
            !a.equals(null)
            !a.equals((Object)new StringCoding());
    }
}
