package myra

class BootStrap {

    def init = { servletContext ->

      new myra.Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
        new myra.Product(name: "Evening Blend", sku: "BB01", price: 10.25).save()

    }
    def destroy = {


    }
}
