/**
 *
 * @author Romit Sagu
 */
package coe318.lab3;

public class Counter {

    public int mod, digit;
    public Counter left; //Instance variables here

    public Counter(int modulus, Counter left) {
        this.mod = modulus;
        this.left = left;
    }

    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.mod;
    }

    /**
     * Returns the Counter to the left attached to this Counter. Returns null if
     * there is no Counter to the left.
     *
     * @return the left
     */
    public Counter getLeft() {

        if (left == null) {
            return null;
        }

        return left;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = digit;
    }

    /**
     * Increment this counter. If it rolls over, its left Counter is also
     * incremented if it exists.
     */
    public void increment() {
        if (this.getDigit() == (this.getModulus() - 1)) {
            this.setDigit(0);
            if (getLeft() != null) {
                getLeft().increment();
            }
        } else if (this.getDigit() < this.getModulus()) {
            setDigit(getDigit()+1);
        }
    }

    /**
     * Return the count of this Counter combined with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (this.getLeft() == null) {
            return this.getDigit();
        }

        return (this.getDigit() + (this.getLeft().getDigit() * getModulus()));
    }

    /**
     * Returns a String representation of the Counter's total count (including
     * its left neighbour).
     *
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
