import cern.ais.User

class BootStrap {

    def init = { servletContext ->

        def users = ['José Bobes', 'Manuel Álvarez', 'Eloy Reguero']

        users.each {
            User user = new User(name: it)
            user.save()
        }
    }

    def destroy = {

    }
}
