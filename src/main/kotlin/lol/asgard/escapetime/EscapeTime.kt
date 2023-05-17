package lol.asgard.escapetime

interface EscapeTime {

    fun api(): EscapeTimeAPI

    fun testApi() {
        println("EscapeTime API working correctly!")
    }

}