package edu.orangecoastcollege.cs273.nhoang53.inandout;

/**
 * Nguyen Hoang C02288487
 * Project 2: In and Out
 */

public class Order {
    int mCheeseburgers;
    int mDoubleDoubles;
    int mFrenchFries;
    int mLargeDrinks;
    int mMediumDrinks;
    int mSmallDrinks;
    int mShakes;
    private static double PRICE_CHESSBURGERS = 2.15;
    private static double PRICE_DOUBLE_DOUBLE = 3.60;
    private static double PRICE_FRENCH_FRIES = 1.65;
    private static double PRICE_SHAKES = 2.20;
    private static double PRICE_SMALL_DRINK = 1.45;
    private static double PRRICE_MEDIUM_DRINK = 1.55;
    private static double PRICE_LARGE_DRINK = 1.75;
    private static double TAX = 0.08;

    /**
     * Calculate the subtotal of the order
     * @return
     */
    public double calculateSubtotal(){
         return  mCheeseburgers * PRICE_CHESSBURGERS +
                 mDoubleDoubles * PRICE_DOUBLE_DOUBLE +
                 mFrenchFries * PRICE_FRENCH_FRIES +
                 mLargeDrinks * PRICE_LARGE_DRINK +
                 mMediumDrinks * PRRICE_MEDIUM_DRINK +
                 mSmallDrinks * PRICE_SMALL_DRINK +
                 mShakes * PRICE_SHAKES;
    }

    /**
     * Calculate the tax base on subtotal
     * @return
     */
    public double calculateTax(){
        return calculateSubtotal() * TAX;
    }

    /**
     * Calculate the total price base on subtotal and tax
     * @return
     */
    public double calculateTotal(){
        return calculateSubtotal() + calculateTax();
    }

    /**
     * Calculate the number of items ordered
     * @return
     */
    public int getNumberItemsOrdered(){
        return mCheeseburgers + mShakes + mSmallDrinks + mMediumDrinks + mLargeDrinks + mDoubleDoubles + mFrenchFries;
    }

    /**
     * Default constructor, assign 0 to each member variables
     */
    public Order(){
        mCheeseburgers = 0;
        mDoubleDoubles = 0;
        mFrenchFries = 0;
        mLargeDrinks = 0;
        mMediumDrinks = 0;
        mSmallDrinks = 0;
        mShakes = 0;
    }

    /**
     * get number of items cheese burgers
     * @return
     */
    public int getmCheeseburgers() {
        return mCheeseburgers;
    }

    /**
     * get number of items double double burger
     * @return
     */
    public int getmDoubleDoubles() {
        return mDoubleDoubles;
    }

    /**
     * get number of items frence fries
     * @return
     */
    public int getmFrenchFries() {
        return mFrenchFries;
    }

    /**
     * get number of items large drink
     * @return
     */
    public int getmLargeDrinks() {
        return mLargeDrinks;
    }

    /**
     * get number of item medium drink
     * @return
     */
    public int getmMediumDrinks() {
        return mMediumDrinks;
    }

    /**
     * get number of item small drink
     * @return
     */
    public int getmSmallDrinks() {
        return mSmallDrinks;
    }

    /**
     * get number of item shakes
     * @return
     */
    public int getmShakes() {
        return mShakes;
    }

    /**
     * assign value for mCheeseburgers member
     * @param mCheeseburgers
     */
    public void setmCheeseburgers(int mCheeseburgers) {
        this.mCheeseburgers = mCheeseburgers;
    }

    /**
     * assign value for mDoubleDoubles member
     * @param mDoubleDoubles
     */
    public void setmDoubleDoubles(int mDoubleDoubles) {
        this.mDoubleDoubles = mDoubleDoubles;
    }

    /**
     * assign value for mFrenchFries member
     * @param mFrenchFires
     */
    public void setmFrenchFires(int mFrenchFires) {
        this.mFrenchFries = mFrenchFires;
    }

    /**
     * assign value for mLargeDrinks member
     * @param mLargeDrinks
     */
    public void setmLargeDrinks(int mLargeDrinks) {
        this.mLargeDrinks = mLargeDrinks;
    }

    /**
     * assign value for mMediumDrinks member
     * @param mMediumDrinks
     */
    public void setmMediumDrinks(int mMediumDrinks) {
        this.mMediumDrinks = mMediumDrinks;
    }

    /**
     * assign value for mSmallDrinks member
     * @param mSmallDrinks
     */
    public void setmSmallDrinks(int mSmallDrinks) {
        this.mSmallDrinks = mSmallDrinks;
    }

    /**
     * assign value for mShakes member
     * @param mShakes
     */
    public void setmShakes(int mShakes) {
        this.mShakes = mShakes;
    }
}
