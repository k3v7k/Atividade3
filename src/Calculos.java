public class Calculos {
    double imc;
    public double imc (double peso, double altura){



        altura = altura/100;
        imc = (peso/(altura*altura));

        return imc;

    }
    public String Classi(){
        String classif;
        if(imc<17){
            classif = "Muito abaixo do peso";

        } else if( imc >=17 && imc<18.49){
           classif = "Abaixo do peso";
        }else if( imc >=18.50 && imc<24.99){
            classif = "Peso Normal";
        }else if( imc >=25 && imc<29.99){
            classif = "Obesidade";
        }else if( imc >=30 && imc<34.99){
            classif = "Obesidade severa";
        }else{
            classif = "Obesidade mórbida";
        }
        return classif;

    }

}