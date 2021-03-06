package com.ssafy.api.request;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//
///**
// * 유저 로그인 API ([POST] /api/v1/auth/login) 요청에 필요한 리퀘스트 바디 정의.
// */
//@Getter
//@Setter
//@ApiModel("UserLoginPostRequest")
//public class UserLoginPostReq {
//	@ApiModelProperty(name="유저 ID", example="test")
//	String id;
//	@ApiModelProperty(name="유저 Password", example="1234")
//	String password;
//}

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * JWT 리퀘스트 바디
 * */

@Data
@ApiModel("JWTRequest")
public class JWTReq {
	@ApiModelProperty(name="JWT 인증 토큰", example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN...")
	String jwt;

}

