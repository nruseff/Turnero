package Metodos;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class traer_hora 
{
    public String traer_hora()
    {
        String hora;
        Calendar cal = Calendar.getInstance(); 
        Date fecha = cal.getTime(); 
        DateFormat formatter = DateFormat.getTimeInstance(); 
        hora = formatter.format(fecha);
        return hora;
    }
    
     
    
    
}
