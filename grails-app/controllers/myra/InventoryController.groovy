package myra

class InventoryController {

    // default action
    def index() {

        render "Here is a list of everything"

    }

    def edit(){

        // added data to be displayed to view.
        def productName = "Breakfast Blend"
        def sku = "BB01"

        //  Values are stored in placeholder product and sku.// Same will be used in view.

        [product:productName, sku:sku]

    }

    // added one more  action
    def remove() {
        render "You have one less item than before"
    }

    // new actio which will query daa from  db and send to view.

    def list(){

        def allProducts  = Product.list(); // This will give everything stored in Product domain to allProducts variable.
         [allProducts:allProducts]  // pass to placeholder allProducts which can be now viewed in list view.


    }

}
