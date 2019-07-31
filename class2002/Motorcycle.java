public class Motorcycle {
        int x = 10;

        private class Motorcycle {
            int y = 5;
        }
    }

    public class MyMotorcycle {
        public static void main(String[] args) {
            OuterClass myOuter = new OuterClass();
            OuterClass.IMotorcycle myInner = myOuter.new Motorcycle();
            System.out.println(myMotorcycle.y + myMotorcycle.x);
        }
    }

