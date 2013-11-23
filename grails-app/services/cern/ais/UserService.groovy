package cern.ais

class UserService {

    def getListOfUsers() {
        return User.findAll()
    }
}
