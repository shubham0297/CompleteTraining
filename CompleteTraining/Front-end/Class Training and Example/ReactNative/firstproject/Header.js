import React from 'react'                                       // Used rnf (Ctrl+space)
import { View, Text,StyleSheet,Image } from 'react-native'

const Header = (props) => {
    return (
        <View>
             <Text>{props.title}</Text>
            <Image source={require("./busDepo.jpg")}/>
        </View>
    )
}

export default Header
const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#edf',
      alignItems: 'center',
      justifyContent: 'center',
      fontSize: 14
    },
  });