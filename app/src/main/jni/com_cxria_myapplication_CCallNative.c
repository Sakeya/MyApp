#include "com_cxria_myapplication_CCallNative.h"

/*
 * Class:     com_cxria_myapplication_CCallNative
 * Method:    hello
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_cxria_myapplication_CCallNative_hello
  (JNIEnv * env, jobject thiz){
  printf("hello");
}

