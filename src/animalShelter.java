import java.util.LinkedList;

public class animalShelter {

	LinkedList<Dog> dogs = new LinkedList();
	LinkedList<Cat> cats = new LinkedList();
	private int order = 0;
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		
		if(a instanceof Dog){
			dogs.addLast((Dog)a);
		}
		else if(a instanceof Cat){
			cats.addLast((Cat)a);
		}	
	}
	
	public Animal dequeueAny(){
		if(dogs.size() == 0){
			return dequeueCats();
		}
		else if(cats.size() == 0){
			return dequeueDogs();
		}
		
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if(dog.isOlder(cat)){
			return dequeueDogs();
		}
		else{
			return dequeueCats();
		}
	}
	
	public Dog dequeueDogs(){
		return dogs.poll();
	}
	
	public Cat dequeueCats(){
		return cats.poll();
	}
	
	
	public static void main(String args[]){
		Dog dog1 = new Dog("Brett");
		Dog dog2 = new Dog("Dave");
		
		Cat cat1 = new Cat("WHISKERS");
		Cat cat2 = new Cat("Mouse Killer");
		
		animalShelter queue = new animalShelter();
		queue.enqueue(cat1);
		queue.enqueue(dog1);
		queue.enqueue(dog2);
		queue.enqueue(cat2);
		
		Animal test = queue.dequeueAny();
		System.out.println(test.name);
	}
}
