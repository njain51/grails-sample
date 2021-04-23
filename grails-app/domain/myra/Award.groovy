package myra

class Award {

    Date awardDate
    String type
    Integer points
    // static means - this variable or relationship will be constant.
    static belongsTo = [customer:Customer]


    static constraints = {

        awardDate()
        type()
        points()
    }
}
