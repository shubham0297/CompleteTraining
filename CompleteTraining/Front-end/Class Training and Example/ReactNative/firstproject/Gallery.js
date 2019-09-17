import React from 'react'                   // used rnf ctrl+space  
import { View, Text,Image ,StyleSheet,ScrollView} from 'react-native'

const Gallery = () => {
    return (
        <View>
        <Text>{"\n"}Gallery{"\n"}</Text>
        <ScrollView vertical >
            <Image source={require("./assets/beautiful-mind.jpg")}/>
            <Image source={require("./assets/ddlj.jpg")}/>
            <Image source={require("./assets/imitation-game.jpg")}/>
            <Image source={require("./assets/robot.jpg")}/>
            <Image source={require("./assets/snowden.jpg")}/>
        </ScrollView>
        </View>                
    )
}
const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#edf',
      alignItems: 'center',
      justifyContent: 'center',
    },
  });

export default Gallery
