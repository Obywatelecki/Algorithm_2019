package test.myvector;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import myStruct.MyVector;

/**
* myStruct.MyVector Tester.
*
* @author <Authors name>
* @since <pre>mar 2, 2019</pre>
* @version 1.0
*/
public class MyVectorTest {

    MyVector<Integer> v;

@Before
public void before() throws Exception {

    v = new MyVector();
}

@After
public void after() throws Exception {
}

/**
*
* Method: size()
*
*/
@Test
public void testSize() throws Exception {

    Assert.assertEquals(0,v.size());

}

/**
*
* Method: isEmpty()
*
*/
@Test
public void testIsEmpty() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: contains(Object o)
*
*/
@Test
public void testContains() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: iterator()
*
*/
@Test
public void testIterator() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: toArray()
*
*/
@Test
public void testToArray() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: add(Object o)
*
*/
@Test
public void testAddO() throws Exception {

    for (int i = 0; i < 100; ++i) {
        v.add(i);
    }
    Assert.assertEquals(100, v.size());
}

/**
*
* Method: remove(Object o)
*
*/
@Test
public void testRemoveO() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: addAll(Collection c)
*
*/
@Test
public void testAddAllC() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: addAll(int index, Collection c)
*
*/
@Test
public void testAddAllForIndexC() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: clear()
*
*/
@Test
public void testClear() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: get(int index)
*
*/
@Test
public void testGet() throws Exception {

   v.add(1);
   v.add(2);
   v.add(40);

   Assert.assertEquals(v.get(0),1);
   Assert.assertEquals(v.get(1),2);
   Assert.assertEquals(v.get(2),40);
}

/**
*
* Method: set(int index, Object element)
*
*/
@Test
public void testSet() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: add(int index, Object element)
*
*/
@Test
public void testAddForIndexElement() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: remove(int index)
*
*/
@Test
public void testRemoveIndex() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: indexOf(Object o)
*
*/
@Test
public void testIndexOf() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: lastIndexOf(Object o)
*
*/
@Test
public void testLastIndexOf() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: listIterator()
*
*/
@Test
public void testListIterator() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: listIterator(int index)
*
*/
@Test
public void testListIteratorIndex() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: subList(int fromIndex, int toIndex)
*
*/
@Test
public void testSubList() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: retainAll(Collection c)
*
*/
@Test
public void testRetainAll() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: removeAll(Collection c)
*
*/
@Test
public void testRemoveAll() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: containsAll(Collection c)
*
*/
@Test
public void testContainsAll() throws Exception {
//TODO: Test goes here... 
}

/**
*
* Method: toArray(Object[] a)
*
*/
@Test
public void testToArrayA() throws Exception {
//TODO: Test goes here... 
}


/**
*
* Method: doubleSize()
*
*/
@Test
public void testDoubleSize() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = myStruct.MyVector.getClass().getMethod("doubleSize");
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
}

} 
