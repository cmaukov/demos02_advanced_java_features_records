package com.pluralsight.advancedjava.exercises.exercise02;
/* demos
 * @created 08/01/2022
 * @author Konstantin Staykov
 */

public final class Validation {

    public static void checkThis(boolean exp, String message){
        if(!exp) throw new IllegalArgumentException(message);
    }
}
