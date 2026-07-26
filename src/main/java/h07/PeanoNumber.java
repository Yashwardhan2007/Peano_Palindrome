package h07;

import org.tudalgo.algoutils.student.Student;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * represents a peano number
 */
public class PeanoNumber {

    @DoNotTouch
    private final PeanoValue type;
    @DoNotTouch
    private final PeanoNumber predecessor;

    /**
     * constructs a zero
     */
    @DoNotTouch
    public PeanoNumber() {
        type = PeanoValue.Zero;
        predecessor = null;
    }

    /**
     * constructs a successor
     * @param predecessor the predecessor of the successor
     */
    @DoNotTouch
    public PeanoNumber(PeanoNumber predecessor) {
        if (predecessor == null) {
            throw new IllegalArgumentException("Predecessor cannot be null!");
        }
        type = PeanoValue.Successor;
        this.predecessor = predecessor;
    }

    /**
     * returns the type of a peano number
     * @return the type of a peano number
     */
    @DoNotTouch
    public PeanoValue getType() {
        return type;
    }

    /**
     * returns the predecessor of a peano number
     * does not work on a zero
     * @return the predecessor of a peano number
     */
    @DoNotTouch
    public PeanoNumber getPredecessor() {
        if (type == PeanoValue.Zero) {
            throw new UnsupportedOperationException("Zero does not have a Predecessor!");
        }
        return predecessor;
    }

    /**
     * returns a string representation of a peano number
     * @return peano number as a string
     */
    @DoNotTouch
    public String toString() {
        if (type == PeanoValue.Zero) {
            return "(" + type + ")";
        }
        return "(" + type + predecessor + ")";
    }

    /**
     * recursively converts a peano number into an int
     * @return peano number as an int
     */
    @StudentImplementationRequired("H7.1.1")
    public int asIntRecursive() {
        //return Student.crash(); //TODO: H7.1.1 - remove if implemented
        PeanoValue type = getType();
        if(type == PeanoValue.Zero){
            return 0;
        }else {

            return 1+getPredecessor().asIntRecursive();
        }

    }
    /**
     * imperatively converts a peano number into an int
     * @return peano number as an int
     */
    @StudentImplementationRequired("H7.1.2")
    public int asIntIterative() {
        //return Student.crash(); //TODO: H7.1.2 - remove if implemented
        int result=0;
        PeanoNumber current =this;
        while (current.getType() != PeanoValue.Zero){
            result++;
            current = current.getPredecessor();
        }
        return  result;
    }

    /**
     * recursively converts an int into a peano number
     * @return int as peano number
     */
    @DoNotTouch
    public static PeanoNumber fromInt(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number may not be below zero!");
        }
        if (number == 0) {
            return new PeanoNumber();
        }
        return new PeanoNumber(fromInt(number-1));
    }

    /**
     * iteratively converts an int into a peano number
     * @return int as peano number
     */
    @DoNotTouch
    public static PeanoNumber fromInt2(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number may not be below zero!");
        }
        PeanoNumber result = new PeanoNumber();
        while (number != 0) {
            result = new PeanoNumber(result);
            number -= 1;
        }
        return result;
    }

    /**
     * recursively adds a peano number onto this one
     * @param peanoNumber the peano number to add
     * @return this + peanoNumber
     */
    @StudentImplementationRequired("H7.1.3")
    public PeanoNumber addRecursive(PeanoNumber peanoNumber) {
        //return Student.crash(); //TODO: H7.1.3 - remove if implemented
        if(peanoNumber.getType() == PeanoValue.Zero){
            return this;
        }
        return new PeanoNumber(this.addRecursive(peanoNumber.getPredecessor()));

    }

    /**
     * iteratively adds a peano number onto this one
     * @param peanoNumber the number to add
     * @return this + peanoNumber
     */
    @StudentImplementationRequired("H7.1.4")
    public PeanoNumber addIterative(PeanoNumber peanoNumber) {
        //return Student.crash(); //TODO: H7.1.4 - remove if implemented
        PeanoNumber result = this;
        while(peanoNumber.getType() != PeanoValue.Zero){
            result = new PeanoNumber(result);
            peanoNumber=peanoNumber.getPredecessor();
        }
        return result;
    }

    /**
     * recursively multiplies this peano number with another one
     * @param peanoNumber the number to multiply with
     * @return this + peanoNumber
     */
    @StudentImplementationRequired("H7.1.5")
    public PeanoNumber multiplyRecursive(PeanoNumber peanoNumber) {
        //return Student.crash(); //TODO: H7.1.5 - remove if implemented
        return (peanoNumber.getType()==PeanoValue.Zero) ? new PeanoNumber() :this.addRecursive(this.multiplyRecursive(peanoNumber.getPredecessor()));
    }

    /**
     * imperatively multiplies this peano number with another one
     * @param peanoNumber the number to multiply with
     * @return this + peanoNumber
     */
    @StudentImplementationRequired("H7.1.6")
    public PeanoNumber multiplyIterative(PeanoNumber peanoNumber) {
        //return Student.crash(); //TODO: H7.1.6 - remove if implemented
        PeanoNumber result = new PeanoNumber();

        while(peanoNumber.getType() != PeanoValue.Zero){
            result = result.addIterative(this);
            peanoNumber = peanoNumber.getPredecessor();
        }
        return  result;

    }

}
