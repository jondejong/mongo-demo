package mongo.demo

class Family {

    String familyName
    static hasMany = [people: Person]

    static constraints = {
    }
}
