// There can be multible instances of sealed classes.
// The subClasses can have their own propertis.

sealed class NetworkState{
    data class error(val errorText: String): NetworkState();
    object loading: NetworkState();
    data class loaded(val content: String): NetworkState()
}

fun main(){
    val data: NetworkState = NetworkState.loaded("Data Loaded");
    processState(data);

}

fun processState(state: NetworkState){
    when (state){
        is NetworkState.error -> { println("Error Occurred: ${state.errorText}") }
        is NetworkState.loading -> { /* show progress bar*/ }
        is NetworkState.loaded -> { println("Content: ${state.content}") }
        // no need to else
    }
}