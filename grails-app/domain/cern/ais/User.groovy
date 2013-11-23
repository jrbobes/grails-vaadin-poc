package cern.ais

class User {

    String name

    static constraints = {
        name(nullable: false)
    }

}
