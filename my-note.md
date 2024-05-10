### Overriding equals method for comparing 2 objects' internal state

* Inside the cat class :-

```
// This can be generated using the IDE 🥹
    @Override
    public boolean equals(Object o) {
        // this --> current obj ,  o --> object which is being compared
        if (this == o) return true;  // If the two references point to the same object, they are equal

        if (o == null || getClass() != o.getClass())
            return false;  // If the other object is null or not an instance of the Cat class, they are not equal

        Cat cat = (Cat) o;  // Cast the other object to a Cat instance

        // Compare the values of the instance variables
        // for comparing primitives == is used & for comparing strings equals method is used 😊
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

```

* The equals method in Java is used to determine if two objects are considered equal or not. In the Java programming
  language, the equals method is defined in the Object class, which is the root class for all classes in Java. By
  default, the equals method provided by the Object class compares the references (memory addresses) of the two objects.
  However, in many cases, we want to consider two objects as equal based on their internal state (the values of their
  instance variables) rather than their memory addresses.

<br/>

* Inside the Main class :-

```
    Cat c1 = new Cat("Tom");
    Cat c2 = new Cat("Tom");

    System.out.println(c1 == c2);  // memory addresses will be compared --> false

    System.out.println(c1.equals(c2));  // internal state will be compared since we override equals method  --> true


```

### POJO vs Bean

**POJO**

* Can 't extend Anything.
* Can't implement anything.
* No outside annotations.

**BEAN**

* Public no-args constructor
* Properties must be private.
* Public getters and setters
* Must be serializable. -> Implements Serializable