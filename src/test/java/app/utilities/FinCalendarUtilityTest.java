package app.utilities;

import org.junit.Test;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Kroma on 2/10/2017.
 */
public class FinCalendarUtilityTest {

    private static FinCalendarUtility calendarUtility;
    private final Format referenceDateFormat = new SimpleDateFormat("dd-MM-YYYY");

    @org.junit.Before
    public void setUp() throws Exception {
        calendarUtility = new FinCalendarUtility();
    }

    @Test
    public void default_date_is_trade()
    {
        Date expectedDate = new Date();
        assertEquals(  referenceDateFormat.format(expectedDate), calendarUtility.getTradeDate());
    }

    @Test
    public void day_after_of_trade()
    {
        Date expectedDate = new Date();
        expectedDate.setDate(expectedDate.getDate()+1);
        assertEquals(  referenceDateFormat.format(expectedDate), calendarUtility.T_PLUS_1_SettlementDate());
    }

    @Test
    public void two_day_after_of_trade()
    {
        Date expectedDate = new Date();
        expectedDate.setDate(expectedDate.getDate()+2);
        assertEquals(  referenceDateFormat.format(expectedDate), calendarUtility.T_PLUS_2_SettlementDate());
    }
}