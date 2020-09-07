package classandobject

interface inputHandler {

    fun clicked()
    fun doubleClick()
    fun singleClick()

}

class Phone:inputHandler {
    override fun clicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun doubleClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun singleClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class Button: inputHandler{
    override fun clicked() {
        println("Button clicked")
    }

    override fun doubleClick() {
        println("Button doubleClicked")
    }

    override fun singleClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main() {
    var myButton = Button()
    myButton.clicked()
    myButton.doubleClick()

}