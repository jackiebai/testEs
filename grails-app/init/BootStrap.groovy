class BootStrap {

    def personService
    def init = { servletContext ->
        personService.addPerson("Jackie Bai")
        personService.addPerson("John Smith")
    }
    def destroy = {
    }
}
