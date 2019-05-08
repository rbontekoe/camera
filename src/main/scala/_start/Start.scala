package _start

  import com.typesafe.config.ConfigFactory

  import actors.ApartmentSupervisor
  import akka.actor.ActorSystem
  import akka.actor.Props

object RoomMonitor extends App {
  // Load application.conf section of RoomMonitor
  val config = ConfigFactory.load.getConfig("RoomMonitor")

  // Create ActorSystem for RoomMonitor
  val system = ActorSystem("RoomMonitor", config)

  // Create AppartmentSupervisor
  val supervisor = system.actorOf(Props[ApartmentSupervisor], "supervisor")

  // CentralSystem actor (RoomRepositoryActor) who will receive the image file
//  val targetActor = system.actorSelection(config.getString("centralSystemActor"))

  //TODO ApartmentSupervisor managing the lifecycle of PictureManager actors

  // Local service
//  val pictureManager = system.actorOf(Props(PictureManager(targetActor, RemoteRoomApi())), "pictureManager")

  // PictureManager actor scheduler, will be the future task of the ApartmentSupervisor
//  import system.dispatcher
//  import scala.concurrent.duration._

//  system.scheduler.schedule(1 seconds, 2 seconds, pictureManager, TakePictureAndCompare)
}

