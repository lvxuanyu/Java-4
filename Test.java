����   : M  	joje/Test  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ljoje/Test; main ([Ljava/lang/String;)V  joje/Graduate  同学
     (Ljava/lang/String;)V
     setFee (I)V  joje/University
  	
     ! payOff (Ljoje/Salary;)V	 # % $ java/lang/System & ' out Ljava/io/PrintStream; ) java/lang/StringBuilder + 是否满足付款需求
 ( 
  . / 0 isLoan ()Z
 ( 2 3 4 append (Z)Ljava/lang/StringBuilder;
 ( 6 7 8 toString ()Ljava/lang/String;
 : < ; java/io/PrintStream =  println ? joje/Teacher A 老师
 >  args [Ljava/lang/String; g Ljoje/Graduate; u Ljoje/University; t Ljoje/Teacher; 
SourceFile 	Test.java !               /     *� �    
                    	       �     G� Y� L+� � Y� M,+� � "� (Y*� ,+� -� 1� 5� 9� >Y@� BN,-� �    
   "     
   
     7  A  F     *    G C D   
 = E F   . G H  A  I J   K    L