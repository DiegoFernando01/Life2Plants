
const int sensorPin = A0;
void setup() {
  Serial.being(9600);

}

void loop() {
  int humedad = analogRead(sensorPin);
  Serial.print(humedad);

  if(humedad<500){
    Serial.println("Encendido")
    //hacer que las acciones sean necesarias 
    }

    delay(1000);
}
