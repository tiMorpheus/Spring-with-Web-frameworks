package user.bo.impl;

import user.bo.UserBo;

import javax.inject.Named;

@Named
public class UserBoImpl implements UserBo {


    @Override
    public String getMessage() {
        return "Jsf 2 + Spring Integration";
    }
}
