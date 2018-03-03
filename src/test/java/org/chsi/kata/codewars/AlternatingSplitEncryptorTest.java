package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlternatingSplitEncryptorTest {

    @Test
    public void encrypt() {
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptByIterativeNestedLoop("This is a test!", 0));
        assertEquals("hsi  etTi sats!",  AlternatingSplitEncryptor.encryptByIterativeNestedLoop("This is a test!", 1));
        assertEquals("s eT ashi tist!", AlternatingSplitEncryptor.encryptByIterativeNestedLoop("This is a test!", 2));
        assertEquals(" Tah itse sits!", AlternatingSplitEncryptor.encryptByIterativeNestedLoop("This is a test!", 3));
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptByIterativeNestedLoop("This is a test!", 4));
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptByIterativeNestedLoop("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", AlternatingSplitEncryptor.encryptByIterativeNestedLoop("This kata is very interesting!", 1));
    }

    @Test
    public void decrypt() {
        assertEquals("This is a test!", AlternatingSplitEncryptor.decrypt("This is a test!", 0));
        assertEquals("This is a test!", AlternatingSplitEncryptor.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", AlternatingSplitEncryptor.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", AlternatingSplitEncryptor.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", AlternatingSplitEncryptor.decrypt("This is a test!", 4));
        assertEquals("This is a test!", AlternatingSplitEncryptor.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", AlternatingSplitEncryptor.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));

    }


    @Test
    public void encryptRecursive() {
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptRecursive("This is a test!", 0));
        assertEquals("hsi  etTi sats!",  AlternatingSplitEncryptor.encryptRecursive("This is a test!", 1));
        assertEquals("s eT ashi tist!", AlternatingSplitEncryptor.encryptRecursive("This is a test!", 2));
        assertEquals(" Tah itse sits!", AlternatingSplitEncryptor.encryptRecursive("This is a test!", 3));
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptRecursive("This is a test!", 4));
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptRecursive("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", AlternatingSplitEncryptor.encryptRecursive("This kata is very interesting!", 1));
    }

    @Test
    public void encryptRecursiveWithStream() {
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptRecursiveWithStream("This is a test!", 0));
        assertEquals("hsi  etTi sats!",  AlternatingSplitEncryptor.encryptRecursiveWithStream("This is a test!", 1));
        assertEquals("s eT ashi tist!", AlternatingSplitEncryptor.encryptRecursiveWithStream("This is a test!", 2));
        assertEquals(" Tah itse sits!", AlternatingSplitEncryptor.encryptRecursiveWithStream("This is a test!", 3));
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptRecursiveWithStream("This is a test!", 4));
        assertEquals("This is a test!", AlternatingSplitEncryptor.encryptRecursiveWithStream("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", AlternatingSplitEncryptor.encryptRecursiveWithStream("This kata is very interesting!", 1));

    }

}