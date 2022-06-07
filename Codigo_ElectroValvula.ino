int input;


void setup() {
  pinMode(13,OUTPUT );
  pinMode(11,OUTPUT );
  Serial.begin(115200);
}

void loop() {
  
int lectura = analogRead(A0);

  if (Serial.available() > 0) {

    input = Serial.read();

    if (input == '1'){
       digitalWrite(13, HIGH);

    }
      else if (input == '0') {
       digitalWrite(13, LOW);

    }

   else if (input =='2'){
  //lectura entre 1000 - 1023
  if(lectura >= 1000){
    Serial.println(">> EL SENSOR ESTA PRACTICAMENTE DESCONECTADO");
    }
  else if(lectura < 1000 && lectura >= 600){
    Serial.println(">> EL SUELO ESTA SECO");
    }
    else if(lectura < 600 && lectura >=370){
     Serial.println(">> EL SUELO ESTA HUMEDO");  
      }
      else if (lectura < 370){
         Serial.println(">> EL SUELO ESTA DEMASIADO HUMEDO");
        }
   delay(1000);

      }

 }
       
}
