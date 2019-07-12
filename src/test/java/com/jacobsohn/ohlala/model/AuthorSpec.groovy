package com.jacobsohn.ohlala.model

import spock.lang.Specification

class AuthorSpec extends Specification {
    def "Two Authors are equal to each other"() {
        given:
            Author a = new Author()
            Author b = new Author()
        when:
            a.setId(1)
            b.setId(1)
        then:
            a.equals(b)
            b.equals(a)
    }

    def "Two Authors are not equal to each other"() {
        given:
            Author a = new Author()
            Author b = new Author()
        when:
            a.setId(1)
            b.setId(2)
        then:
            !a.equals(b)
            !b.equals(a)
    }

    def "Authors runs smooth with null or different class as equal object"() {
        given:
            Author a = new Author()
        when:
            a.setId(1)
        then:
            !a.equals(null)
            !a.equals((Object)new StringCoding());
    }
}
