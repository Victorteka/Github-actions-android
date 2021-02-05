package victorteka.github.io.koin_tutorial.data.api

import retrofit2.Response
import victorteka.github.io.koin_tutorial.data.model.User

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}