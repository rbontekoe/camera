from picamera import PiCamera, Color
from time import sleep
camera = PiCamera()
camera.rotation = 180
camera.resolution = (320, 240)
camera.start_preview()
camera.image_effect = 'none'
sleep(2)
camera.capture('photo.jpg')
camera.stop_preview()

