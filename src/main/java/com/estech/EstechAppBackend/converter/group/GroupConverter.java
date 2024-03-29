package com.estech.EstechAppBackend.converter.group;

import com.estech.EstechAppBackend.dto.group.GroupDTO;
import com.estech.EstechAppBackend.model.Group;
import org.springframework.stereotype.Component;

@Component
public class GroupConverter {

    public GroupDTO convertGroupEntityToGroupDTO(Group group) {
        GroupDTO groupDTO = new GroupDTO();

        groupDTO.setName(group.getName());
        groupDTO.setDescription(group.getDescription());
        groupDTO.setYear(group.getYear());

        return groupDTO;
    }

}
