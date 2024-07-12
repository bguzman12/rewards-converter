import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash = 19.01;
        RewardValue val = new RewardValue(cash);
        assertEquals((int) (19.01 / 0.0035), val.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 120;
        RewardValue val = new RewardValue(miles);
        assertEquals(miles * 0.0035, val.getCashValue());
    }
}
