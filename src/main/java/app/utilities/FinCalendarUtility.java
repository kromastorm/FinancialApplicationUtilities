package app.utilities;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Kroma on 2/10/2017.
 */
public class FinCalendarUtility {

    private final Format dateFormat = new SimpleDateFormat("dd-MM-YYYY");

    public String getTradeDate()
    {
        Date t_Date = new GregorianCalendar().getTime();
        return dateFormat.format(t_Date);
    }

    public String T_PLUS_1_SettlementDate()
    {
        Calendar cal = new GregorianCalendar();
        cal.add(Calendar.DATE, 1);
        Date t_Date = cal.getTime();

        return dateFormat.format(t_Date);
    }

    public String T_PLUS_2_SettlementDate()
    {
        Calendar cal = new GregorianCalendar();
        cal.add(Calendar.DATE, 2);
        Date t_Date = cal.getTime();

        return dateFormat.format(t_Date);
    }

    public String T_PLUS_3_SettlementDate()
    {
        Calendar cal = new GregorianCalendar();
        cal.add(Calendar.DATE, 3);
        Date t_Date = cal.getTime();

        return dateFormat.format(t_Date);
    }
}
