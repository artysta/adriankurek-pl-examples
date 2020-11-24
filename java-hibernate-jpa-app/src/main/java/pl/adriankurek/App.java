    package pl.adriankurek;

    import javax.persistence.EntityManager;
    import javax.persistence.EntityManagerFactory;
    import javax.persistence.Persistence;

    public class App 
    {
        public static void main( String[] args )
        {
            try {
                System.out.println("Connecting to the MySQL database...\n");

                EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("localdatabase");
                EntityManager entityManager = entityManagerFactory.createEntityManager();
            
                System.out.println("\nConnected succesfully!\n");

                Car car = CarData.getRandomCar();

                entityManager.getTransaction().begin();
                entityManager.persist(car);
                entityManager.getTransaction().commit();

                System.out.println(String.format("\nCar \"%s\" succesfully added to the database!\n", car.toString()));

                entityManager.close();
                entityManagerFactory.close();
            
                System.out.println("\nConnection closed...\n");
            } catch (Exception e) {
                System.err.println("\nSomething went wrong: " + e.getMessage());
            }
            
            System.exit(0);
        }
    }
