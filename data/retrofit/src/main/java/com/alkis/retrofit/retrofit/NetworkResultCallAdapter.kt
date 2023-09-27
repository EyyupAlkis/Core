package com.alkis.retrofit.retrofit

import com.alkis.retrofit.model.ApiResult
import retrofit2.Call
import retrofit2.CallAdapter
import java.lang.reflect.Type


/**
 *  author : eyyup alkis
 *  email : alkis.eyyup@gmail.com
 */
class NetworkResultCallAdapter(
    private val resultType: Type
) : CallAdapter<Type, Call<ApiResult<Type>>> {
    override fun responseType(): Type = resultType

    override fun adapt(call: Call<Type>): Call<ApiResult<Type>> {
        return NetworkResultCall(call)
    }
}