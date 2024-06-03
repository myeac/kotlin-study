package interfaces

/*

An interface is a definition o a PART OF A CLASS
parte de uma clase


tell you what a class/objeect can do

obj can access other obj through their interfaces
- web browsers

similar to abstract class

interface has no constructor

can implement methods but NO THE STEPS/ALGORITHM

interface CANT initiate values, but CAN update them

interface can INHERIT from antohjer interface

can be used as variable types
- instantiation

*/

//example

interface PlaceToSit {}
interface PlaceToSleep {}

class Couch : PlaceToSit, PlaceToSleep {

}
