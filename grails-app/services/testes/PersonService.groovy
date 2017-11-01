package testes

import grails.transaction.Transactional

@Transactional
class PersonService {

    def addPerson(Person person){
        person.save()
        person.index()
    }

    def addPerson(String name) {
        Person p = new Person(name:name)
        addPerson(p)

    }
}
