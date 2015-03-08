import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralsShould {

    @Test public void
    generate_roman_numerals_from_a_decimal_number() {
        assertThat(RomanNumerals.romanFrom(1), is("I"));
        assertThat(RomanNumerals.romanFrom(2), is("II"));
        assertThat(RomanNumerals.romanFrom(3), is("III"));
        assertThat(RomanNumerals.romanFrom(4), is("IV"));
        assertThat(RomanNumerals.romanFrom(5), is("V"));
        assertThat(RomanNumerals.romanFrom(6), is("VI"));
        assertThat(RomanNumerals.romanFrom(8), is("VIII"));
        assertThat(RomanNumerals.romanFrom(9), is("IX"));
        assertThat(RomanNumerals.romanFrom(10), is("X"));
        assertThat(RomanNumerals.romanFrom(16), is("XVI"));
        assertThat(RomanNumerals.romanFrom(51), is("LI"));
        assertThat(RomanNumerals.romanFrom(92), is("XCII"));
        assertThat(RomanNumerals.romanFrom(103), is("CIII"));
        assertThat(RomanNumerals.romanFrom(407), is("CDVII"));
        assertThat(RomanNumerals.romanFrom(507), is("DVII"));
        assertThat(RomanNumerals.romanFrom(909), is("CMIX"));
        assertThat(RomanNumerals.romanFrom(3387), is("MMMCCCLXXXVII"));
    }

    @Test public void
    applyToDecimalNumber() {
        assertThat(RomanNumerals.RomanToDecimal.applyTo(3), is(RomanNumerals.RomanToDecimal.I));
        assertThat(RomanNumerals.RomanToDecimal.applyTo(5), is(RomanNumerals.RomanToDecimal.V));
        assertThat(RomanNumerals.RomanToDecimal.applyTo(6), is(RomanNumerals.RomanToDecimal.V));
        assertThat(RomanNumerals.RomanToDecimal.applyTo(10), is(RomanNumerals.RomanToDecimal.X));
        assertThat(RomanNumerals.RomanToDecimal.applyTo(11), is(RomanNumerals.RomanToDecimal.X));
    }
}
