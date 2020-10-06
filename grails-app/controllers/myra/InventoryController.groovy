package myra

class InventoryController {

    def index() {

        render "Here is a list of everything"

    }

    def remove() {
        render "You have one less item than before"
    }

}
