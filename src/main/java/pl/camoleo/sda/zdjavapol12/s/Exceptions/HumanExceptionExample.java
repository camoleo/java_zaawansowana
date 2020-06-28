package pl.camoleo.sda.zdjavapol12.s.Exceptions;

//public class HumanExceptionExample {
//    public static void main(String[] args) {
//        Human human = new Human();
//        try {
//            human.swim();
//        } catch (HumanCannotSwimException e) {
//            System.out.println("Naucz się pływać czlowieku");
//            e
//        } catch (CannotSwimException e){
//            e.printStackTrace();
//            System.out.println("no Trudno");
//        }
//    //    human.swim();
//    }
//
//
//    class CannotSwimException extends Exception {
//    }
//
//
//    class Human {
//        boolean canSwim = false;
//
//        public void swim() throws CannotSwimException {
//            // nieumiejetnosc plywania w trakcie kiedy próbujemy pływac
//            // moze byc niebezpieczną sytuacją wartą obsłużenia,
//            // np potrzeba zawołania ratownika (͡•ʖ͡•)
//            if (!canSwim) {
//                CannotSwimException cannotSwimException = new HumanCannotSwimException((this));
//                throw cannotSwimException;
//            }
//        }
//    }
//
//    class HumanCannotSwimException extends CannotSwimException {
//        private Human human;
//
//        public HumanCannotSwimException(Human human) {
//            this.human = human;
//        }
 //   }