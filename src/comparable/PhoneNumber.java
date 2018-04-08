package comparable;

import java.util.Comparator;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.reverseOrder;


public class PhoneNumber implements Comparable<PhoneNumber>{
    final short areaCode;
    final short prefix;
    final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber){
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNumber() {
        return lineNumber;
    }
//    //inplementation 1
//    @Override
//    public int compareTo(PhoneNumber o) {
//        int result = Short.compare(areaCode, o.areaCode);
//        if( result == 0 ){
//            result = Short.compare(prefix, o.prefix);
//            if(result == 0 )
//                result = Short.compare(lineNumber,o.lineNumber);
//        }
//        return result;
//    }

    //implementation 2
    @Override
    public int compareTo(PhoneNumber o) {
        return COMPARATOR.compare(this, o);
    }

    @Override
    public String toString(){
        return "" + areaCode + prefix + lineNumber;
    }

    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNumber);


//    private static final Comparator<PhoneNumber> COMPARATOR =
//            comparingInt(PhoneNumber::getAreaCode)
//                    .thenComparingInt(PhoneNumber::getPrefix)
//                    .thenComparingInt(PhoneNumber::getLineNumber);
}
