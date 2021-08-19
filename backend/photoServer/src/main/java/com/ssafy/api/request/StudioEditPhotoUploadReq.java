/* 2021-07-28 스켈레톤 코드 작성	by.HeeJung,Lee */

package com.ssafy.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

/**
 * 스튜디오 수정페이지 전체사진 사진 추가 API ([POST] /studioedit/photo) 요청에 필요한 리퀘스트 바디 정의.
 */
@Getter
@Setter
@ApiModel("StudioEditPhotoUploadRequest")
public class StudioEditPhotoUploadReq {
	@ApiModelProperty(name="tag List", example="웨딩, 우정, 졸업")
	String[][] data;
	@ApiModelProperty(name="file", example="업로드 사진")
	List<MultipartFile> file;
}
