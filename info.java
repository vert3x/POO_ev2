package POO_ev2;
//info del producto
public class info {
    public String   prod_nombre;
    public int      prod_costo;
    public int      prod_dias;
    public int      prod_disponible;
    public String   prod_plataforma;

        public info(String prod_nombre_new, int prod_costo_new, int prod_dias_new, int prod_disponible_new) {
    }

        public void prod_info (String prod_nombre_new, int prod_costo_new, int prod_dias_new, int prod_disponible_new , String prod_plataforma_new)
        {
            prod_nombre     =   prod_nombre_new;
            prod_costo      =   prod_costo_new;
            prod_dias       =   prod_dias_new;
            prod_disponible =   prod_disponible_new;
            prod_plataforma =   prod_plataforma_new;
        }

                
                    public void setprod_nombre(String prod_nombre)
                    {
                        this.prod_nombre ="titanic";
                    }
                   public String getprod_nombre()
                    {
                        return prod_nombre;
                    }

                    public int getprod_costo()
                    {
                        return prod_costo;
                    }

                    public void setprod_costo(int prod_costo)
                    {
                        this.prod_costo =prod_costo;
                    }

                    public int getprod_dias()
                    {
                        return prod_dias;
                    }

                    public void setprod_dias(int prod_dias)
                    {
                        this.prod_dias =prod_dias;
                    }

                    public int getprod_disponible()
                    {
                        return prod_disponible;
                    }

                    public void setprod_disponible(int prod_disponible)
                    {
                        this.prod_disponible =prod_disponible;
                    }

                    public String getprod_plataforma()
                    {
                        return prod_plataforma;
                    }

                    public void setprod_dias(String prod_plataforma)
                    {
                        this.prod_plataforma =prod_plataforma;
                    }


}
