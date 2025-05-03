package com.PMS.service;

import java.util.List;

import com.PMS.exception.ChatException;
import com.PMS.exception.ProjectException;
import com.PMS.exception.UserException;
import com.PMS.model.Message;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

