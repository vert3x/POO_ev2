package POO_ev2;

public class movie extends info
{
    public String   prod_nombre;
    public int      prod_costo;
    public int      prod_dias;
    public int      prod_disponible;
    public int      prod_year;
    public String   prod_genero;


public movie(String prod_nombre_new, int prod_costo_new, int prod_dias_new, int prod_disponible_new ,int prod_year_new,String prod_genero_new)
{
super (prod_nombre_new, prod_costo_new,  prod_dias_new,  prod_disponible_new);
prod_genero=prod_genero_new;
prod_year=prod_year_new;

setprod_nombre("Titanic");





}

public String getprod_nombre()
{
    return prod_nombre;
}

public int getprod_costo()
{
    return prod_costo;
}

public int getprod_dias()
{
    return prod_dias;
}

public int getprod_disponible()
{
    return prod_disponible;
}

public int getprod_year()
{
    return prod_year;
}

public String getprod_genero()
{
    return prod_genero;
}


}