package mongo.demo

class Person {

    String firstName
    String lastName
    Integer age

    String toString() {
        "${firstName} ${lastName}"
    }

    static constraints = {
    }
}
