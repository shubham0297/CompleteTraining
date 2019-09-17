import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
var result=[];
componentDidMount() {
  fetch("https://jsonplaceholder.typicode.com/todos").then(resp=>resp.json()).then(data=>{this.result=data})
}

export default function App() {
  return (
    <ScrollView vertical >
           <Text>{result.userId}</Text>
           <Text>{result.id}</Text>
           <Text>{result.title}</Text>
           <Text>{result.completed}</Text>
    </ScrollView>
    );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
