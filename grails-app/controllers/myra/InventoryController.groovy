package myra

class InventoryController {

    // default action
    def index() {

        render "Here is a list of everything"

    }

    def edit(){

        def productName = "Breakfast Blend"
        def sku = "Indian"

        [product:productName, sku:sku]

    }

    // added one more  action
    def remove() {
        render "You have one less item than before"
    }

}
