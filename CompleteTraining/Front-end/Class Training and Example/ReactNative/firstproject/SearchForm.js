import React, { Component } from 'react'                        // used rnc Ctrl+space
import { Text, View,ActivityIndicator,TextInput,FlatList } from 'react-native'

export default class SearchForm extends Component {
    constructor(props){
        super(props);
        this.state = {busRoutes:[]}
    }

    componentDidMount(){
        fetch().then().then();
    }
    render() {
        return (
            <View>
                <Text> Found the Following buses : </Text>
                <TextInput></TextInput>
                <TextInput></TextInput>
                {/* <Button onPre */}

            </View>
        )
    }
}
